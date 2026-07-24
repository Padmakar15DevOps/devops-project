terraform {
  required_version = ">= 1.0.0"
}

resource "local_file" "hello" {
  filename = "hello.txt"
  content  = "Hello from Terraform!"
}