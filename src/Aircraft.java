enum Type{
	PASSENGER,
	CARGO
}

enum Size{
	SMALL,
	LARGE
}

enum Request{
	BOOT,
	ENQUEUE,
	DEQUEUE,
	PRINT
}
class Aircraft implements Comparable<Aircraft> {
	
	private int seq;

	private Type type;
	private Size size;
	
	public Aircraft(Type type, Size size){
		this.setType(type);
		this.setSize(size);
		
	}
	
	
	@Override
	public int compareTo(Aircraft other) {
		if(this.getType() == Type.PASSENGER){
			if(other.getType() == Type.PASSENGER){
				if(this.getSize() == other.getSize()){
					if(this.getSeq()<other.getSeq())
						return -1;
					else
						return 1;
				}
				else if(this.getSize() == Size.LARGE)
					return -1;
				else
					return 1;
			}
			else{
				return -1;
			}
		}
		else{
			if(other.getType() == Type.PASSENGER){
				return 1;
			}
			else{
				if(this.getSize() == other.getSize()){
					if(this.getSeq()<other.getSeq())
						return -1;
					else
						return 1;
				}
				else if(this.getSize() == Size.LARGE)
					return -1;
				else
					return 1;
			}
		}
		
	}


	public int getSeq() {
		return seq;
	}


	public void setSeq(int seq) {
		this.seq = seq;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	public Size getSize() {
		return size;
	}


	public void setSize(Size size) {
		this.size = size;
	}

}
