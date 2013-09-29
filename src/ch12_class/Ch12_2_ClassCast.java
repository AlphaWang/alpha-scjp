/**
 * <p>文件名称: Ch12_2_ClassCast.java </p>
 * <p>文件描述: 无</p>
 * <p>版权所有: 版权所有(C)2001-2004</p>
 * <p>公    司: 深圳市中兴通讯股份有限公司</p>
 * <p>内容摘要: 无</p>
 * <p>其他说明: 无</p>
 * <p>创建日期：2012-2-6</p>
 * <p>完成日期：2012-2-6</p>
 * <p>修改记录1: // 修改历史记录，包括修改日期、修改者及修改内容</p>
 * <pre>
 *    修改日期：
 *    版 本 号：
 *    修 改 人：
 *    修改内容：
 * </pre>
 * <p>修改记录2：…</p>
 * @version 1.0
 * @author WangZhongXing192063
 */
package ch12_class;

public class Ch12_2_ClassCast {
	public static void main(String[] args){
			
		Super obj = new Sub();
		
		/**
		 * Java5新增的Class转型语法：
		 */
		Class<Sub> subType = Sub.class;		
		Sub subObj = subType.cast(obj);
		
		//以上二行，等效于：
		Sub subObj2 = (Sub) obj;
		
		/**
		 * instanceof 与 Class.isInstance()
		 * 
		 * 当需要遍历判断多个instance，后者更好用————动态的instanceof
		 */
		boolean isInstance = subType.isInstance(subObj);
		
		boolean isInstance2 = subObj2 instanceof Sub;
		
		System.out.println("Class.isInstance(obj): "+isInstance);
		System.out.println("obj isinstanceof 类名: "+isInstance2);
		
	}

}
