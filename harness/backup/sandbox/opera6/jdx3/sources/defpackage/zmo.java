package defpackage;

import java.io.File;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class zmo extends ozb implements Function0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ wjh j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zmo(wjh wjhVar, byte b) {
        super(0);
        this.i = b;
        this.j = wjhVar;
    }

    public final Object invoke() {
        byte b = this.i;
        wjh wjhVar = this.j;
        switch (b) {
            case 0:
                return new File((File) wjhVar.b, (String) wjhVar.c);
            default:
                return new yjo((File) wjhVar.d, "mraid.js", "https://img-odx.op-mobile.opera.com/a/js/mraid.js");
        }
    }
}
