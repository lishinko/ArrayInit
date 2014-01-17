/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

/**
 *
 * @author lixg
 */
public class ShortToUnicodeString extends ArrayInitBaseListener{
    @Override
    public void enterInit(ArrayInitParser.InitContext ctx){
        System.out.print("\"");
    }
    @Override
    public void exitInit(ArrayInitParser.InitContext ctx) {
        System.out.print("\"");
    }

    @Override
    public void enterValue(ArrayInitParser.ValueContext ctx) {
        //选择INT分支的parse结果，但是，如果不是INT分支，就返回空指针了。
        //注意看g4文件，ValueContext有2个分支
        int value = Integer.parseInt(ctx.INT().getText());
        //这样也是不可以的，因为，嵌套的树形结构是不能getText()的。
        //但是，如果数据正确(不含嵌套)，那么这句话和上面一句的效果是一样的
        //int value = Integer.parseInt(ctx.getText());
        System.out.printf("\\u%04x",value);
    }

    
}
