/**
 * 
 */

/**
 * @author Administrator
 *
 */
public class FooBar {
	//��Ͼۺ�ԭ��
	private ICallBack callBack; 
	public void setCallBack(ICallBack callBack) 
	{
		this.callBack = callBack;
		doSth(); 
	} 
	
	public void doSth() { 
		callBack.postExec();
		} 
}
