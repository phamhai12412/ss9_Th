package bt4;

class HinhChuNhat extends Hinh {
    private double chieuDai;
    private double chieuRong;

    // Constructor
    public HinhChuNhat(String mauSac, double chieuDai, double chieuRong) {
        super(mauSac);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    // Getter và Setter
    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    // Triển khai phương thức tinhDienTich() cho HinhChuNhat
    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
}