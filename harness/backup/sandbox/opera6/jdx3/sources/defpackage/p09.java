package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.autofill.AutofillValue;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class p09 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<p09> CREATOR;
    public static final ir5 a;
    public static final k09 b;
    public static final l09 c;
    public static final i09 d;
    public static final m09 e;
    public static final j09 f;
    public static final /* synthetic */ p09[] g;

    static {
        k09 k09Var = new k09();
        b = k09Var;
        l09 l09Var = new l09();
        c = l09Var;
        i09 i09Var = new i09();
        d = i09Var;
        m09 m09Var = new m09();
        e = m09Var;
        j09 j09Var = new j09();
        f = j09Var;
        g = new p09[]{k09Var, l09Var, i09Var, m09Var, j09Var};
        a = new ir5();
        CREATOR = new uz8((byte) 1);
    }

    public static p09 valueOf(String str) {
        return (p09) Enum.valueOf(p09.class, str);
    }

    public static p09[] values() {
        return (p09[]) g.clone();
    }

    public AutofillValue d(String str) {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
