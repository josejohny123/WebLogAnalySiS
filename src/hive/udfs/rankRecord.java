package hive.udfs;

	import org.apache.hadoop.hive.ql.exec.UDF;
	 
	public final class rankRecord extends UDF{
	    private int  counter;
	    private String last_key;
	    public int evaluate(final String key){
	      if ( !key.equalsIgnoreCase(this.last_key) ) {
	         this.counter = 0;
	         this.last_key = key;
	      }
	      return this.counter++;
	    }
	}
	

