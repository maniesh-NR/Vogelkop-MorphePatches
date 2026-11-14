package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class zwa extends ozb implements Function0 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ axa j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zwa(axa axaVar, byte b) {
        super(0);
        this.i = b;
        this.j = axaVar;
    }

    public final Object invoke() {
        byte b = this.i;
        axa axaVar = this.j;
        switch (b) {
            case 0:
                return axaVar.requireActivity().getViewModelStore();
            default:
                return axaVar.requireActivity().getDefaultViewModelCreationExtras();
        }
    }
}
