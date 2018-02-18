# FizzBuzz as a Service


Experiment to get to know Scalatra a little bit.

Simple API with swagger support to implement:

* FizzBuzz
* Factorials

# TODO

* HTTP API tests
* Model ouput JSON data structure (factorial isn't really valid)

# Usage

* Run server (with reload support) using: `sbt '~;jetty:stop;jetty:start'`
* Run tests using: `sbt test`

## FizzBuzz API Examples

Get FizzBuzz from 1-15:

```bash
curl -s http://localhost:8080/api/v1/fizzbuzz/15 | jq .
[
  1,
  2,
  "Fizz",
  4,
  "Buzz",
  "Fizz",
  7,
  8,
  "Fizz",
  "Buzz",
  11,
  "Fizz",
  13,
  14,
  "Fizz Buzz"
]

```

Get FizzBuzz from 10-15:

```bash
curl -s http://localhost:8080/api/v1/fizzbuzz/15\?from\=10 | jq .
[
  "Buzz",
  11,
  "Fizz",
  13,
  14,
  "Fizz Buzz"
]
```

## Factorial API Examples


Get the factorial of 8:

```bash
curl -s http://localhost:8080/api/v1/factorial/8 | jq .
40320
```