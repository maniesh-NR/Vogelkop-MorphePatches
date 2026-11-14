package defpackage;

import ads_mobile_sdk.ax0;
import android.content.Context;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class cwh {
    public final yvh a;
    public final ArrayList b;
    public final zvh c;

    public cwh(yvh yvhVar, ArrayList arrayList, zvh zvhVar) {
        awh awhVar = awh.a;
        bwh bwhVar = bwh.a;
        this.a = yvhVar;
        this.b = arrayList;
        this.c = zvhVar;
    }

    public final boolean a(Context context) throws NoSuchAlgorithmException {
        dvj dvjVar = ax0.f;
        return CollectionsKt.E(this.b, dvj.o(context));
    }
}
