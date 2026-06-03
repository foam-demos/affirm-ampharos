# Loan Lifecycle Service

System of record for all Affirm loans. Manages loan state machines, repayment schedules, delinquencies, and charge-offs. Python/Flask with Aurora MySQL backend. Critical financial workload with strict SLAs.

## Running Locally
```bash
docker-compose up -d mysql
python -m venv venv && source venv/bin activate
pip install -r requirements.txt
flask run
```