class RnaTranscription {

    String transcribe(String dnaStrand) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        int n = dnaStrand.length();
        StringBuffer s = new StringBuffer();
        for(int i=0;i<n;i++)
        {
            char c = dnaStrand.charAt(i);
            char x=' ';
            if(c=='G')
                x='C';
            else if(c=='C')
                x='G';
            else if(c=='T')
               x='A';
            else if(c=='A')
               x='U';
            else
                throw new IllegalArgumentException("Invalid Input");
            s.append(x);

        }
        return s.toString();
    }

}
