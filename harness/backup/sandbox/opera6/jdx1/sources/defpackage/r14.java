package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.emoji2.emojipicker.EmojiPickerView;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r14 extends kuk implements Function2 {
    public final /* synthetic */ d5o t;
    public final /* synthetic */ int u;
    public final /* synthetic */ Context v;
    public final /* synthetic */ TypedArray w;
    public final /* synthetic */ int[] x;
    public final /* synthetic */ String[] y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r14(d5o d5oVar, int i, Context context, TypedArray typedArray, int[] iArr, String[] strArr, mt5 mt5Var) {
        super(2, mt5Var);
        this.t = d5oVar;
        this.u = i;
        this.v = context;
        this.w = typedArray;
        this.x = iArr;
        this.y = strArr;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new r14(this.t, this.u, this.v, this.w, this.x, this.y, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        List listG;
        px5 px5Var = px5.a;
        ybh.y(obj);
        d5o d5oVar = this.t;
        int i = this.u;
        StringBuilder sb = new StringBuilder("emoji.v1.");
        sko.r(EmojiPickerView.l ? 1 : 0, i, ".", ".", sb);
        sb.append(xkm.a("🥱") ? 1 : 0);
        String string = sb.toString();
        q14 q14Var = new q14(this.v, this.w, this.u, (byte) 0);
        synchronized (d5oVar.c) {
            File file = new File((File) d5oVar.a, (String) d5oVar.b);
            if (!file.exists()) {
                File[] fileArrListFiles = ((File) d5oVar.a).listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        z29.h(file2);
                    }
                }
                file.mkdirs();
            }
            File file3 = new File(file, string);
            listG = d5o.G(file3);
            if (listG == null) {
                listG = d5o.P(file3, q14Var);
            }
        }
        int[] iArr = this.x;
        int i2 = this.u;
        return new o14(iArr[i2], this.y[i2], listG);
    }
}
