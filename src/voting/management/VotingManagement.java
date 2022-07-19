
package voting.management;


public class VotingManagement {

    
    public static void main(String[] args) {
        splash Splash=new splash();
        Splash.setVisible(true);
        adminlogin h=new adminlogin();
        try
        {
        for(int i=0;i<=100;i++)
        {
        Thread.sleep(30);
        Splash.loadingnum.setText(Integer.toString(i)+"%");
        Splash.loadingbar.setValue(i);
        if(i==100)
        {
        Splash.setVisible(false);
        h.setVisible(true);
        }
        }
        }catch (Exception e)
        {
            
        }
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
