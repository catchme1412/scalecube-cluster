package io.scalecube.cluster.election;

import java.util.concurrent.atomic.AtomicLong;

public class Term {

  private final AtomicLong term = new AtomicLong(0);

  public long nextTerm() {
    return term.incrementAndGet();
  }

  public boolean isBefore(long timestamp) {
    return this.term.longValue() < timestamp;
  }

  public long getLong() {
    return this.term.longValue();
  }

  public void set(long timestamp) {
    this.term.set(timestamp);
  }

  @Override
  public String toString() {
    return "Term [term=" + term.get() + "]";
  }
}