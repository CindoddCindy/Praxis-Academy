echo "Enter username"
read username
echo "enter password"
read password
if [[ ($username == "admin" && $passsword =="secret")]];
then 
echo "valid user"
else 
echo "invalid user"
fi