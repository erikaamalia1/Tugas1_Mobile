package org.aplas.tugas1_mobile;

import android.os.Parcel;
import android.os.Parcelable;

public class Bunga implements Parcelable {
    private String tittle;
    private String deskripsi;
    private String image;

    public Bunga(String tittle, String deskripsi, String image) {
        this.tittle = tittle;
        this.deskripsi = deskripsi;
        this.image = image;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.tittle);
        dest.writeString(this.deskripsi);
        dest.writeString(this.image);
    }

    public void readFromParcel(Parcel source) {
        this.tittle = source.readString();
        this.deskripsi = source.readString();
        this.image = source.readString();
    }

    protected Bunga(Parcel in) {
        this.tittle = in.readString();
        this.deskripsi = in.readString();
        this.image = in.readString();
    }

    public static final Creator<Bunga> CREATOR = new Creator<Bunga>() {
        @Override
        public Bunga createFromParcel(Parcel source) {
            return new Bunga(source);
        }

        @Override
        public Bunga[] newArray(int size) {
            return new Bunga[size];
        }
    };
}
