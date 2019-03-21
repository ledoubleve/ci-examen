
openssl req -nodes -x509 -newkey rsa:4096 -keyout demo.local.key -out demo.local.crt -days 365 -config certs.conf

certutil -d sql:$HOME/.pki/nssdb -A -t TC -n "demo.local.crt" -i demo.local.crt 
certutil -d sql:$HOME/.pki/nssdb -L

certutil -D -d sql:$HOME/.pki/nssdb -n demo.local.crt
