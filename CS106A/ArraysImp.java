import acm.program.*;
public class ArraysImp extends ConsoleProgram{

	private static final int sentinel=-1;
public void run()
{
	int numscore=0;
	int maxlen=10;
	int midterm[] =new int[maxlen];
	for(int i=0;i<maxlen;i++){
		int score=readInt("Score:");
		midterm[i]=score;
		if(score==sentinel)
		{
			System.out.println("Values are:");
			for(int j=0;j<numscore;j++){
				System.out.println(midterm[j]);
			}
			break;
		}
		numscore++;
		//System.out.println(numscore++);
    }
	
}
}
