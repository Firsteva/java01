package java01.Test51;

class MyStack {
	Object[] list = new Object[100];
	int top; //0


	public void push(Object value){
		list[top++]=value;	  
	}// push

	// 마지막에 입력한 값을 꺼낸다. 목록에서 제거됨.
	public Object pop() {
		Object temp=list[--top];
		if(top>=0){
			list[top]=null;
			return temp;
		}
		else return 0;
	}
}

class MyQueue {
	class Bucket {
		Object value;
		Bucket next;
	}

	Bucket start;
	Bucket end;

	public MyQueue() {
		start = new Bucket();
		end = start;
	}

	public void add(Object value) {
		end.value=value;
		end.next=new Bucket();
		end=end.next;
	}

	// 첫 번째 입력 값을 꺼낸다. 목록에서 제거됨.
	public Object poll() { 
		Object temp=start.value;
		start=start.next;
		return temp;
	}
}




public class CollectionTest08 {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("0000");
		stack.push("1111");
		stack.push("2222");
		stack.push("3333");

		for (int i = 0; i < 4; i++) {
			System.out.println(stack.pop());

		}

		/* 예상 출력 결과
     3333
     2222
     1111
     0000
		 */

		System.out.println("-------------------");

		MyQueue queue = new MyQueue();
		queue.add("AAAA");
		queue.add("BBBB");
		queue.add("CCCC");
		queue.add("DDDD");

		for (int i = 0; i < 4; i++) {
			System.out.println(queue.poll());
		}
		/* 예상 출력 결과
    AAAA
    BBBB
    CCCC
    DDDD
		 */
	}

}













