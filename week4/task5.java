import java.util.*;
class queueadt{
int f,r;
int maxsize;
int[] q;
queueadt(int x){
f=r=-1;
maxsize=x;
q=new int[maxsize];
}
void enqueue(int x){
if(r==maxsize-1){
System.out.println("overflow!");
}else{
if(f==-1){
f=0;
}
q[++r]=x;
System.out.println("Inserted value: "+x);
}
}
int dequeue(){
if(f==-1){
System.out.println("underflow");
return -1;
}else{
int x=q[f];
if(f==r){
f=r=-1;
}else{
f++;
}
return x;
}
}
void display(){
if(f==-1){
System.out.println("Queue empty!");
}else{
System.out.println("Queue Elements:");
for(int i=f;i<=r;i++){
System.out.println(q[i]+" ");
}
System.out.println();
}
}
public static void main(String[] args){
queueadt q1=new queueadt(4);
q1.enqueue(10);
q1.enqueue(20);
q1.enqueue(30);
q1.enqueue(40);
q1.enqueue(50);
q1.display();
q1.dequeue();
q1.display();
q1.dequeue();
q1.display();
}
}
