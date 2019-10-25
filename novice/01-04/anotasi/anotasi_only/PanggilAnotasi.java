import java.lang.annotation.Annotation;

@BikinAnotasi(
    nilai="123",
    nama="Jakob",
    umur=37
    )
    
    public  class PanggilAnotasi implements BikinAnotasi{
        @Override
        public String nilai(String nilai) {
            // TODO Auto-generated method stub
            return null;
        }
        BikinAnotasi bikinAnotasi = new BikinAnotasi(){
        
            @Override
            public Class<? extends Annotation> annotationType() {
                // TODO Auto-generated method stub
                return null;
            }
        
            @Override
            public int umur() {
                // TODO Auto-generated method stub
                return 0;
            }
        
            @Override
            public String nilai() {
                // TODO Auto-generated method stub
                return null;
            }
        
            @Override
            public String nama() {
                // TODO Auto-generated method stub
                return null;
            }
        };

}