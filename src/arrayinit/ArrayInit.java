/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayinit;
import java.io.FileReader;
import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
/**
 *
 * @author lixg
 */
public class ArrayInit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRInputStream(new FileReader("E:\\My Documents\\NetBeansProjects\\ArrayInit\\src\\arrayinit\\array.txt"));
        parser.ArrayInitLexer lexer = new parser.ArrayInitLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser.ArrayInitParser parser2 = new parser.ArrayInitParser(tokens);
        ParseTree tree = parser2.init();
        
//        System.out.println(tree.toStringTree(parser));//打印树，基本上就是调试的时候使用
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new parser.ShortToUnicodeString(), tree);
        System.out.println("");
    }
}
