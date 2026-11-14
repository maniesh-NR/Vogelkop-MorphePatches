package defpackage;

import com.leanplum.messagetemplates.MessageTemplateConstants;

/* loaded from: classes.dex */
public final /* synthetic */ class emn implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jmn b;

    public /* synthetic */ emn(jmn jmnVar, byte b) {
        this.a = b;
        this.b = jmnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        jmn jmnVar = this.b;
        switch (b) {
            case 0:
                jmnVar.G0(0, MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT);
                nnn nnnVar = jmnVar.s.h;
                if (nnnVar != null) {
                    nnnVar.b = true;
                    break;
                }
                break;
            case 1:
                jmnVar.D = false;
                jmnVar.z.i.setVisibility(8);
                break;
            case 2:
                jmnVar.O0();
                break;
            default:
                jmnVar.D = true;
                break;
        }
    }
}
