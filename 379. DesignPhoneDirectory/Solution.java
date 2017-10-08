class PhoneDirectory {

    /** Initialize your data structure here
        @param maxNumbers - The maximum numbers that can be stored in the phone directory. */
    
    int[] phones;
    
    public PhoneDirectory(int maxNumbers) {
        phones = new int[maxNumbers];
        for(int i = 0; i < maxNumbers; i++){
            phones[i] = -1;
        }
    }
    
    /** Provide a number which is not assigned to anyone.
        @return - Return an available number. Return -1 if none is available. */
    public int get() {
        for(int i = 0; i < phones.length; i++){
            if(phones[i] == -1){
                phones[i] = 1;
                return i;
            }
        }
        return -1;
    }
    
    /** Check if a number is available or not. */
    public boolean check(int number) {
        if(phones[number] == -1){
            return true;
        }
        return false;
    }
    
    /** Recycle or release a number. */
    public void release(int number) {
        phones[number] = -1;
    }
}

/**
 * Your PhoneDirectory object will be instantiated and called as such:
 * PhoneDirectory obj = new PhoneDirectory(maxNumbers);
 * int param_1 = obj.get();
 * boolean param_2 = obj.check(number);
 * obj.release(number);
 */