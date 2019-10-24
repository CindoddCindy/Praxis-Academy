public class Relasi{
    public static void main(String[] args) {
        WaitressDanKoki waitressDanKoki = new WaitressDanKoki();

        waitressDanKoki.antarMakanan();
        waitressDanKoki.antarMinuman();
        waitressDanKoki.memasakMakananSehat(kualitas);
        waitressDanKoki.masakMakanan();

        PembeliDanWaitress pembeliDanWaitress = new PembeliDanWaitress();

        pembeliDanWaitress.AntarDenganSenyum(sikap);
        pembeliDanWaitress.antarMakanan();
        pembeliDanWaitress.antarMinuman();

        HakPembeli hakPembeli = new HakPembeli();
        hakPembeli.pesanMakanan();
        hakPembeli.pesanMinuman();

        TugasKoki tugasKoki = new TugasKoki();
        tugasKoki.masakMakanan();
        tugasKoki.racikMinuman();

        TugasWaitress tugasWaitress = new TugasWaitress();

        tugasWaitress.AntarDenganSenyum(sikap);
        tugasWaitress.antarMakanan();
        tugasWaitress.antarMinuman();

}
}

