interface Cipher{
    String encrypt(String a ,int b);
    String decrypt(String a,int b);
}class CeasarCipher implements Cipher{
    @Override public String encrypt (String a,int b){
        StringBuilder encrypted = new StringBuilder();
        b = b % 26;
        for (char c : a.toCharArray()){
            if(Character.isLetter(c)) {
                char d = Character.isUpperCase(c) ? 'A' : 'a';
                encrypted.append((char) ((c - d + b) % 26 + d));
            }else {encrypted.append(c);
            }}return encrypted.toString();
    }@Override public String decrypt (String a,int b){
        return encrypt(a,26 - (b %26));
    }}
