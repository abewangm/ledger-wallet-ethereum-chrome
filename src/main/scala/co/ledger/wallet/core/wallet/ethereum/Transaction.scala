package co.ledger.wallet.core.wallet.ethereum

import java.util.Date

/**
  *
  * Transaction
  * ledger-wallet-ethereum-chrome
  *
  * Created by Pierre Pollastri on 13/06/2016.
  *
  * The MIT License (MIT)
  *
  * Copyright (c) 2016 Ledger
  *
  * Permission is hereby granted, free of charge, to any person obtaining a copy
  * of this software and associated documentation files (the "Software"), to deal
  * in the Software without restriction, including without limitation the rights
  * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
  * copies of the Software, and to permit persons to whom the Software is
  * furnished to do so, subject to the following conditions:
  *
  * The above copyright notice and this permission notice shall be included in all
  * copies or substantial portions of the Software.
  *
  * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
  * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
  * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
  * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
  * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
  * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
  * SOFTWARE.
  *
  */
trait Transaction {
  def hash: String
  def receivedAt: Date
  def value: Ether
  def gas: Ether
  def gasPrice: Ether
  def cumulativeGasUsed: Ether
  def from: String
  def to: String
  def block: Option[Block]
  def nonce: BigInt
  def data: String

  override def toString: String =
    s"""{
       |  nonce: $nonce
       |  hash: $hash
       |  receiveAt: $receivedAt
       |  value: $value
       |  gas: $gas
       |  gasPrice: $gasPrice
       |  cumulativeGasUsed: $cumulativeGasUsed
       |  from: $from
       |  to: $to
       |  block: $block
       |  data: $data
       |}
       |""".stripMargin
}
