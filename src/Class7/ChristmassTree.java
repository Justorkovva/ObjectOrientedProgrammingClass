package Class7;

	public class ChristmassTree {
		private int dim;
		private StringBuilder builder;
		
		public ChristmassTree(int dim) {
			this.dim = dim;
			builder = new StringBuilder();
			drawTree();
		}

		public void drawTree() {
			for (int i=0; i<dim; i++) {
				int first = dim-i;
		    	int last = dim+i;
		    	for (int j=1; j<2*dim; j++) {
		    		if ( j < first || j > last) {
		    			builder.append(' ');
		    		} else {
		    			builder.append('*');
		    		}
		    	}
		    	builder.append('\n');
		    }
		    /* print stem of the tree */
	  	    for (int j=1; j<dim; j++) {
	  	    	builder.append(' ');  	    	
	  	    }
		    builder.append('|');
		}

		@Override
		public String toString() {
			return builder.toString();
		}
			
	}