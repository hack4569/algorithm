package algorithm.stack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class Print {

	public void solution(int[] priorities, int location){
		// TODO Auto-generated method stub

	        int size = 0;
	        int order = 1;
	        
	        Queue<Integer> print = new LinkedList<Integer>();
	        //�迭�� ť��
	        for(int printItem : priorities){
	            print.add(printItem);
	            size +=1;
	        }
	        
	        Iterator<Integer> iter = print.iterator();
	        
	        int polledI;	        
	        int firstPrint=0;
	        int nextPrint;
	        
	        //ť�� ���Ұ� �����ϴ��� ��� ���ư�
	        while(iter.hasNext()){
	            int j = 0;
	            for(int i=j; i<size; i++){
	            	nextPrint = iter.next();
	                if(i==0){
	                    firstPrint = nextPrint;
	                    continue;
	                }
	                //queue�ȿ� ù��° ��Һ��� ū ���� ���� ���
	                if(firstPrint<nextPrint){
	                    //location���� ������ index�� 0�� �� ���
	                	if(i!=(size-1)) {
	                		polledI = print.poll();
	                        print.add(polledI);
	                        iter = print.iterator();
	                        
	                		if(location==0){
		                        location+=size-1;
		                    }else{
		                        location--;
		                    }
	                		
	                		break;
	                	}
	                }
		            //������ ������ ���
	                if(i==(size-1)){
	                    //queue�ȿ� ù��° ��Ұ� ���� ���
                        if(location==0){
                            polledI = print.poll();
                            System.out.print(order);
                        }else{
                            print.poll();
                            order++;
                            location--;
                            size--;
                            iter = print.iterator();
                            break;
                        }
	                }
	            }
	        }
	}

}
