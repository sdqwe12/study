package ex11;

public class Tri {
	
		int width;
		int height; // =0;
		
		public Tri() {
			//기본생성자
		}
		
		// alt + shif + s -> o 엔터 
		public Tri(int width, int height) {
			super();
			this.width = width;
			this.height = height;
		}




		// alt + shift + s -> s 엔터
		@Override
		public String toString() {
			return "Tri [width=" + width + ", height=" + height + "]";
		}
			public double area( ) {
				return width *height*0.5;
			}
		}

