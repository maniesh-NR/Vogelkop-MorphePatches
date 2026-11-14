package defpackage;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class a82 extends z4 implements RandomAccess {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a82(Object obj, byte b) {
        this.b = b;
        this.c = obj;
    }

    public final boolean contains(Object obj) {
        byte b = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                if (!(obj instanceof Integer) || e82.t(((Number) obj).intValue(), (int[]) obj2) < 0) {
                    break;
                }
                break;
            default:
                if (obj instanceof Long) {
                    if (e82.v((long[]) obj2, ((Number) obj).longValue()) >= 0) {
                    }
                }
                break;
        }
        return false;
    }

    public final int d() {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                return ((int[]) obj).length;
            default:
                return ((long[]) obj).length;
        }
    }

    public final Object get(int i) {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                return Integer.valueOf(((int[]) obj)[i]);
            default:
                return Long.valueOf(((long[]) obj)[i]);
        }
    }

    public final int indexOf(Object obj) {
        byte b = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                if (obj instanceof Integer) {
                    return e82.t(((Number) obj).intValue(), (int[]) obj2);
                }
                return -1;
            default:
                if (!(obj instanceof Long)) {
                    return -1;
                }
                return e82.v((long[]) obj2, ((Number) obj).longValue());
        }
    }

    public final boolean isEmpty() {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (((int[]) obj).length == 0) {
                    break;
                }
                break;
            default:
                if (((long[]) obj).length == 0) {
                    break;
                }
                break;
        }
        return true;
    }

    public final int lastIndexOf(Object obj) {
        byte b = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                if (obj instanceof Integer) {
                    int iIntValue = ((Number) obj).intValue();
                    int[] iArr = (int[]) obj2;
                    int length = iArr.length - 1;
                    if (length >= 0) {
                        while (true) {
                            int i = length - 1;
                            if (iIntValue != iArr[length]) {
                                if (i < 0) {
                                    break;
                                } else {
                                    length = i;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                if (obj instanceof Long) {
                    long jLongValue = ((Number) obj).longValue();
                    long[] jArr = (long[]) obj2;
                    int length2 = jArr.length - 1;
                    if (length2 >= 0) {
                        while (true) {
                            int i2 = length2 - 1;
                            if (jLongValue != jArr[length2]) {
                                if (i2 < 0) {
                                    break;
                                } else {
                                    length2 = i2;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                break;
        }
        return -1;
    }
}
