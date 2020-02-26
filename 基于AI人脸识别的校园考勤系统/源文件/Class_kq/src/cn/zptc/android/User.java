package cn.zptc.android;

public class User {
	 private String username;
	    private String gender;
	    private String bh;
	    private String addordelete;

	    public String getUsername() {
	        return username;
	    }
	    public void setUsername(String username) {
	        this.username = username;
	    }
	    public String getGender() {
	        return gender;
	    }
	    public void setGender(String gender) {
	        this.gender = gender;
	    }
	    public String getBh() {
			return bh;
		}
	    public void setBh(String bh) {
			this.bh = bh;
		}
	    public String getAddordelete() {
			return addordelete;
		}
	    public void setAddordelete(String addordelete) {
			this.addordelete = addordelete;
		}

	    /**
	     * 写一个构造方法，能直接将所有信息初始化
	     */
	    public User(String username, String gender, String bh,String addordelete){
	        this.username = username;
	        this.gender = gender;
	        this.bh = bh;
	        this.addordelete=addordelete;
	    }
	    public User(){
	        super();
	    }

}
