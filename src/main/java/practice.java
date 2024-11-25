
public class practice {

	public static void main(String[] args) {
		       
				String s = "He is a very very good boy, isn't he?";
		       
		        
		        s = s.trim();
		        if (s.length() == 0) {
		            System.out.println(0);
		        } 
		        else {
		            String[] strings = s.split("['!?,._@ ]+");
		            System.out.println(strings.length);
		            for (String str : strings)
		                System.out.println(str);
		        }
		    }
		}

	


