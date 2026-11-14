package defpackage;

import com.appsflyer.internal.j;

/* loaded from: classes.dex */
public final class e2g {
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;

    public e2g(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = bool4;
        this.e = bool5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2g)) {
            return false;
        }
        e2g e2gVar = (e2g) obj;
        return this.a.equals(e2gVar.a) && this.b.equals(e2gVar.b) && this.c.equals(e2gVar.c) && this.d.equals(e2gVar.d) && this.e.equals(e2gVar.e);
    }

    public final int hashCode() {
        return ((((((((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + (1237 * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + 1231) * 31) + 1237) * 31) + 1237) * 31) + 1237;
    }

    public final String toString() {
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = Boolean.TRUE;
        StringBuilder sb = new StringBuilder("PartialRecordSettings(sia=");
        sb.append(bool);
        sb.append(", privateMode=");
        sb.append(this.a);
        sb.append(", conversationChips=");
        j.e(sb, this.b, ", trackUserGeoData=", this.c, ", trackUserResponse=");
        j.e(sb, this.d, ", initilizeWithSearchChat=", this.e, ", alwaysShowImageSuggestions=");
        j.e(sb, bool2, ", isShowInputBoxGradientEnabled=", bool, ", enableOneAIBackend=");
        sb.append(bool);
        sb.append(", enableOneAIRenderer=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }
}
