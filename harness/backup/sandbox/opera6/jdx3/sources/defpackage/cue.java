package defpackage;

/* loaded from: classes.dex */
public enum cue {
    None(0),
    NewsFeed(2);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    cue(int i) {
        this.a = i;
    }

    public static cue d(int i) {
        for (cue cueVar : values()) {
            if (i == cueVar.a) {
                return cueVar;
            }
        }
        return null;
    }
}
