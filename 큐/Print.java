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
	        //배열을 큐로
	        for(int printItem : priorities){
	            print.add(printItem);
	            size +=1;
	        }
	        
	        Iterator<Integer> iter = print.iterator();
	        
	        int polledI;	        
	        int firstPrint=0;
	        int nextPrint;
	        
	        //큐에 원소가 존재하는한 계속 돌아감
	        while(iter.hasNext()){
	            int j = 0;
	            for(int i=j; i<size; i++){
	            	nextPrint = iter.next();
	                if(i==0){
	                    firstPrint = nextPrint;
	                    continue;
	                }
	                //queue안에 첫번째 요소보다 큰 값이 있을 경우
	                if(firstPrint<nextPrint){
	                    //location으로 정해진 index가 0이 된 경우
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
		            //마지막 원소일 경우
	                if(i==(size-1)){
	                    //queue안에 첫번째 요소가 있을 경우
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
