package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.ImagesContract;
import com.leanplum.internal.Constants;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class kln implements aln {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;

    public kln(int i, String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
    }

    public static kln h(String str) throws JSONException {
        orb orbVar = new orb(str);
        return new kln(orbVar.a.getInt(Constants.Kinds.COLOR), orbVar.e("id"), orbVar.e("image"), orbVar.m("sort_key", null), orbVar.m(ImagesContract.URL, null));
    }

    @Override // defpackage.aln
    public final g7j b() {
        return null;
    }

    @Override // defpackage.aln
    public final xkn c(Context context, o2c o2cVar) {
        int i = this.c;
        boolean z = !p37.u0(i);
        return new xkn(this, this.b, i, i, i, z, z, z);
    }

    @Override // defpackage.aln
    public final int f() {
        return 1;
    }

    @Override // defpackage.aln
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.aln
    public final int getType() {
        return 2;
    }

    public final String toString() throws JSONException {
        orb orbVar = new orb();
        orbVar.p(this.a, "id");
        orbVar.p(this.b, "image");
        orbVar.n(this.c, Constants.Kinds.COLOR);
        String str = this.d;
        if (str != null) {
            orbVar.p(str, "sort_key");
        }
        String str2 = this.e;
        if (str2 != null) {
            orbVar.p(str2, ImagesContract.URL);
        }
        return orbVar.a.toString();
    }
}
