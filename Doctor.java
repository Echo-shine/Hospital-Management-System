import javax.swing.*;

/*医生登录后可以对本科室当前排队的病人就诊信息进行依次处理，
 * 如果是已经预约过的病人，并且在预约时间前后不超过1小时，则该病人无需排队直接为队列第一个病人。
 * 医生可以开处方，并可以输入药品和收费项目的拼音码快速添加药品信息和收费项目以及数量，
		生成该就诊结果，显示相关信息和价目。
		该就诊信息将自动转向收费处进行收费
 */


public class Doctor {

	JFrame f=new JFrame("医生界面");
	JButton ok=new JButton("确认");
	JButton addMedicine=new JButton("添加药品");
	JButton addItem=new JButton("添加项目");
	JButton print=new JButton("打印");
	JTextArea description=new JTextArea(4,20);
	JTextArea result=new JTextArea(4,20);
	JTextArea recipe=new JTextArea(4,20);
	JMenuBar mb=new JMenuBar();
	JMenu file=new JMenu("文件");
	JMenu edit=new JMenu("编辑");
	Icon newIcon=new ImageIcon("ico/new.png");
	JMenuItem newItem=new JMenuItem("新建",newIcon);
	Icon saveIcon=new ImageIcon("ico/save.png");
	JMenuItem saveItem=new JMenuItem("保存",saveIcon);
	Icon exitIcon=new ImageIcon("ico/exit.png");
	JMenuItem exitItem=new JMenuItem("退出",exitIcon);
	JMenuItem copyItem =new JMenuItem("复制",new ImageIcon("ico/copy.png"));
	JMenuItem pasteItem=new JMenuItem("粘贴",new ImageIcon("ico/paste.png"));
	JMenu format=new JMenu("格式");
	JMenuItem commentItem=new JMenuItem("注释");
	JMenuItem cancelItem=new JMenuItem("取消注释");
	
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
