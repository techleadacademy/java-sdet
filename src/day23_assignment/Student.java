package day23_assignment;

public class Student {
	public String firstName;
	public String lastName;
	public int studetntId;
	public int score;
	
	public Student() {
		super();
	}

	public Student(String firstName, String lastName, int studetntId, int score) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.studetntId = studetntId;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", studetntId=" + studetntId + ", score="
				+ score + "]";
	}
	
	public static void main(String[] args) {
		int[] nums = {1,4,2,89};
		int min = nums[0];
		for(int i = 0; i < nums.length; i++) {
			if(min > nums[0]) {
				min = nums[i];
			}
		}
		System.out.println(min);
	}
}
