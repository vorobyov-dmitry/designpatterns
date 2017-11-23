package patterns.structural.pipeline;

public interface PipeLinePattern {

	public PipeLinePattern sum(int i ); 
	public PipeLinePattern minus(int i );
	public PipeLinePattern multiply (int i );
	public PipeLinePattern divide(int i );
	public int  getI();
	
	
	
}
