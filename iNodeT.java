class iNode<T> {
    protected T value ;
    protected iNode<T> next ;
    
    /* Constructor */
    public iNode() {
    next = null;
    value = null;
    }
    
    /* Constructor */
    public iNode(T d ) {
    value = d;
    next = null;
    }
    
    public void setInfo(T d) {
    value = d;
    }
    
    public void setLink(iNode<T> nxt) {
    next = nxt;
    }
    
    public iNode<T> getLink(){
    return next;
    }
    public T getInfo(){
    return value;
    }
    
    /*
    public boolean equals(T e ) {
    
    return e.equals(value);
    
    */
    
    
    }
    
    public class iNodeT<T> {
    //int numElements ;
    private iNode<T> firstNode;
    
    public iNodeT() {
    firstNode = null;
    }
    public iNodeT(T s) {
    firstNode = new iNode<T>(s);
    
    }
    
    public void push_back(T s ) {
    
    iNode<T> n = new iNode<T>(s) ;
    iNode<T> prev_it = firstNode ;
    iNode<T> it = firstNode ;
    if (firstNode == null ) {
    firstNode = n ;
    return ;
    }
    while( it.getLink() != null ) {
    prev_it = it;
    it = it.getLink();
    }
    it.setLink(n);
    return;
    }
    
    public String toString() {
    
    iNode<T> itr = firstNode ;
    String tstr = "" ;
    
    while(itr != null ) {
    tstr = tstr + " -> " + itr.getInfo();
    itr = itr.getLink();
    
    }
    return tstr ;
    }
    
    private void delNode(iNode<T> pNode , iNode<T> cNode ) {
    
    if ( cNode == firstNode ) {
    firstNode = cNode.getLink();
    }
    pNode.setLink(cNode.getLink());
    cNode.setLink(null);
    return ;
    
    }
    
    public boolean findTheThird(T entry , T replace) {
    iNode<T> prevNode , dNode , itr ;
    int counter =0;
    boolean flg = false;
    boolean flg1 = false;
    itr = firstNode;
    prevNode = firstNode;
    
    while ( itr != null ) {
    
    if ( itr.getInfo().equals(entry) ) {
    counter = counter + 1 ;
    
    if ( counter == 1 ) {
    dNode = itr ;
    itr = itr.getLink();
    delNode(prevNode , dNode );
    continue;
    }
    
    if ( counter == 3 ) {
    itr.setInfo( replace );
    flg = true ;
    }
    
    if ( counter > 3 ) {
    dNode = itr ;
    itr = itr.getLink();
    delNode(prevNode , dNode );
    continue;
    }
    }
    
    prevNode = itr;
    itr = itr.getLink();
    
    }
    
    return flg;
    
    
    }
    
    
    public static void main(String[] args ) {
    
    iNodeT<String> ll = new iNodeT<String>("i3");
    ll.push_back("i3");
    ll.push_back("123");
    ll.push_back("a123");
    ll.push_back("i3");
    for(int i=0 ; i< 10 ; i++ ) {
    ll.push_back( "i" + Integer.toString(i) );
    
    if ( i % 3 == 0 )
    ll.push_back( "i3");
    }
    System.out.println(" #################################################");
    System.out.println("Initial List " + ll.toString());
    System.out.println(" #################################################");
    System.out.println(" findTheThird : " + ll.findTheThird("i3" , "Found3rd"));
    System.out.println(" #################################################");
    System.out.println("After Calling findTheThird on List " + ll.toString());
    System.out.println(" #################################################");
    
    
    iNodeT<String> ll1 = new iNodeT<String>("i3");
    ll1.push_back("i1");
    ll1.push_back("i2");
    ll1.push_back("i3");
    ll1.push_back("i4");
    System.out.println(" #################################################");
    System.out.println("Initial List " + ll1.toString());
    System.out.println(" #################################################");
    System.out.println(" findTheThird : " + ll1.findTheThird("i3" , "Found3rd"));
    System.out.println(" #################################################");
    System.out.println("After Calling findTheThird on List " + ll1.toString());
    System.out.println(" #################################################");
    
    
    iNodeT<String> ll2 = new iNodeT<String>("i3");
    ll2.push_back("i1");
    ll2.push_back("i2");
    
    System.out.println(" #################################################");
    System.out.println("Initial List " + ll2.toString());
    System.out.println(" #################################################");
    System.out.println(" findTheThird : " + ll2.findTheThird("i3" , "Found3rd"));
    System.out.println(" #################################################");
    System.out.println("After Calling findTheThird on List " + ll2.toString());
    System.out.println(" #################################################");
    
    }
    
    
    }