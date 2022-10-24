
    BagInterface<string> newBag = new ArrayBag();
    for(int i = 0; i < myBag.getCurrentSize();i++) {
        int duplicate = 0;
        if (newBag.contains(myBag.get(i))){
            duplicate++;
            String str = "DUP." + duplicate + "." + myBag.get(i);
            newBag.add(str);
        }else{
            newBag.add(myBag.get(i));
        }
    }

