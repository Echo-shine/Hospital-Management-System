import javax.swing.*;

/*ҽ����¼����ԶԱ����ҵ�ǰ�ŶӵĲ��˾�����Ϣ�������δ���
 * ������Ѿ�ԤԼ���Ĳ��ˣ�������ԤԼʱ��ǰ�󲻳���1Сʱ����ò��������Ŷ�ֱ��Ϊ���е�һ�����ˡ�
 * ҽ�����Կ�����������������ҩƷ���շ���Ŀ��ƴ����������ҩƷ��Ϣ���շ���Ŀ�Լ�������
		���ɸþ���������ʾ�����Ϣ�ͼ�Ŀ��
		�þ�����Ϣ���Զ�ת���շѴ������շ�
 */


public class Doctor {

	JFrame f=new JFrame("ҽ������");
	JButton ok=new JButton("ȷ��");
	JButton addMedicine=new JButton("���ҩƷ");
	JButton addItem=new JButton("�����Ŀ");
	JButton print=new JButton("��ӡ");
	JTextArea description=new JTextArea(4,20);
	JTextArea result=new JTextArea(4,20);
	JTextArea recipe=new JTextArea(4,20);
	JMenuBar mb=new JMenuBar();
	JMenu file=new JMenu("�ļ�");
	JMenu edit=new JMenu("�༭");
	Icon newIcon=new ImageIcon("ico/new.png");
	JMenuItem newItem=new JMenuItem("�½�",newIcon);
	Icon saveIcon=new ImageIcon("ico/save.png");
	JMenuItem saveItem=new JMenuItem("����",saveIcon);
	Icon exitIcon=new ImageIcon("ico/exit.png");
	JMenuItem exitItem=new JMenuItem("�˳�",exitIcon);
	JMenuItem copyItem =new JMenuItem("����",new ImageIcon("ico/copy.png"));
	JMenuItem pasteItem=new JMenuItem("ճ��",new ImageIcon("ico/paste.png"));
	JMenu format=new JMenu("��ʽ");
	JMenuItem commentItem=new JMenuItem("ע��");
	JMenuItem cancelItem=new JMenuItem("ȡ��ע��");
	
	public void init(){
		JPanel bottom=new JPanel();
		bottom.add(ok);
		bottom.add(addMedicine);
		bottom.add(addItem);
		bottom.add(print);
	}
	
	public static void main(String[] args) {
		
		
	}

}
