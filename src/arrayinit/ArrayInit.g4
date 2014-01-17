/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar ArrayInit;

init : '{' value (',' value)* '}' ;
value : init
      | INT
      ;
INT : [0-9]+ ;
WS : [ \t\r\n]+ ->skip ;