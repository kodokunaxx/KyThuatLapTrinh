package OOP.PhanSo;

import java.math.BigInteger;

public class PhanSo {
    private BigInteger tuSo, mauSo, ucln;

    public PhanSo(BigInteger tuSo, BigInteger mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        this.ucln = tuSo.gcd(mauSo);
    }
    @Override
    public String toString() {
        return (tuSo.divide(ucln) + "/" + mauSo.divide(ucln));
    }
}
