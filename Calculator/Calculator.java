public class Calculator{

int value;//
int keep;
char todo;//instance variable 
void add(){
   binaryOperation('+');
}

void multiply(){
    binaryOperation ('*');
    
}
void divide(){
    binaryOperation('/');
    
}

void subtract(){
    binaryOperation('-');
    
}
void compute(){
    if (todo=='+')
    value= keep + value;
    else if (todo=='-')
    value=keep-value;
    else if(todo=='*')
    value=keep*value;
    else if (todo=='/')
    value=keep/value;
    keep=0;
}
void clear(){
    value =0;
    keep=0;
    
}
void digit(int x){
    value=value*10 +x;

}

int display(){
    return (value);

}
Calculator(){
    clear();
}


void binaryOperation(char op){
    keep=value;
    value=0;
    todo=op;
    
}

}