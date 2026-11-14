package defpackage;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class emo extends ozb implements Function0 {
    public final /* synthetic */ Context i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emo(Context context) {
        super(0);
        this.i = context;
    }

    public final Object invoke() {
        return AdvertisingIdClient.getAdvertisingIdInfo(this.i);
    }
}
