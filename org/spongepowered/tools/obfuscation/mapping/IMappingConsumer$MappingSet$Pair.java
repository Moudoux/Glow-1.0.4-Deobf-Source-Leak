package org.spongepowered.tools.obfuscation.mapping;

import org.spongepowered.asm.obfuscation.mapping.*;
import com.google.common.base.*;

public static class Pair<TMapping extends IMapping<TMapping>>
{
    public final TMapping from;
    public final TMapping to;
    
    public Pair(final TMapping from, final TMapping to) {
        super();
        this.from = from;
        this.to = to;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof Pair)) {
            return false;
        }
        final Pair pair = (Pair)o;
        return Objects.equal(this.from, pair.from) && Objects.equal(this.to, pair.to);
    }
    
    @Override
    public int hashCode() {
        return Objects.hashCode(this.from, this.to);
    }
    
    @Override
    public String toString() {
        return String.format("%s -> %s", this.from, this.to);
    }
}
