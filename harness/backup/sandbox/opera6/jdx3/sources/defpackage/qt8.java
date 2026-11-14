package defpackage;

import android.content.Context;
import com.opera.android.suggestion.SuggestionProviderBridge;

/* loaded from: classes.dex */
public final class qt8 extends SuggestionProviderBridge {
    public final /* synthetic */ byte d = 0;
    public final Object e;
    public Object f;
    public final Object g;
    public final Object h;

    public qt8(Context context, lrk lrkVar, lrk lrkVar2) {
        d06 d06Var = new d06((byte) 18);
        super(0);
        this.e = context;
        this.f = lrkVar;
        this.g = lrkVar2;
        this.h = d06Var;
    }

    public qt8(Context context, wcd wcdVar) {
        super(0);
        this.h = new vdf(this, (byte) 13);
        this.e = wcdVar;
        this.g = new ro9((byte) 25, nr8.e(context));
    }

    private final void h() {
    }

    @Override // com.opera.android.suggestion.SuggestionProviderBridge
    public final void cancel() {
        switch (this.d) {
            case 0:
                break;
            default:
                ((ro9) this.g).d = null;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x01e6, code lost:
    
        r1 = r17;
        r3 = r21;
     */
    @Override // com.opera.android.suggestion.SuggestionProviderBridge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.String r23, boolean r24, boolean r25, yv4 r26) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qt8.g(java.lang.String, boolean, boolean, yv4):void");
    }
}
