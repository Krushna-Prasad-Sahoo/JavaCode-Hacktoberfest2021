import java.awt.*;
import java.awt.event.*;
class rgbtestss extends Frame implements AdjustmentListener{

	Scrollbar s1=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,256);
	Scrollbar s2=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,256);
	Scrollbar s3=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,256);

	Panel center=new Panel();
	Panel south=new Panel();

	rgbtestss(){
		setTitle("RGB(0,0,0)");
		setSize(400,400);
		center.setBackground(Color.BLACK);
		add(center);

		south.setLayout(new GridLayout(3,2));
		south.add(new Label ("Red : ",Label.RIGHT ));
		south.add(s1);
		south.add(new Label ("Green :  ",Label.RIGHT ));
		south.add(s2);
		south.add(new Label ("Blue : ",Label.RIGHT ));
		south.add(s3);
		add(south,"South");

		s1.addAdjustmentListener(this);
		s2.addAdjustmentListener(this);
		s3.addAdjustmentListener(this);

	}

	public void adjustmentValueChanged(AdjustmentEvent e){
		int r=0,g=0,b=0;
		r=s1.getValue();
		g=s2.getValue();
		b=s3.getValue();

		center.setBackground(new Color(r,g,b));
		setTitle("RGB("+r+","+g+","+b+")");
	}
	public static void main(String args[]){
		rgbtestss rr=new rgbtestss();
		rr.setVisible(true);
	}
}
