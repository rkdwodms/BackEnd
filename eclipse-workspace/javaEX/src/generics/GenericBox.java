package generics;

// 설계시에는 내부 타입을 미정 상태로 둔다.
public class GenericBox<T> { //type의 줄임말
	T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	

}
