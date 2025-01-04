package com.br.myblockchain;

import java.util.Date;

/**
 *
 * @author tetzner
 */
public class Block {
    private final String hash;
    private final String previousHash;
    private final String data;
    private final long timeStamp;

    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }
    
    private String calculateHash(){
        return StringUtil.applySha256(previousHash + Long.toString(timeStamp) + data);
    }

    public String getHash() {
        return hash;
    }

}
